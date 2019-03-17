package at.htl.restclient.rest;

import at.htl.restclient.model.Team;
import at.htl.restclient.repository.Repo;
import org.glassfish.jersey.client.ClientResponse;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import java.io.StringReader;
import java.util.List;

/**
 * https://jersey.github.io/documentation/latest/client.html#d0e4716
 * https://www.baeldung.com/jersey-jax-rs-client
 * https://github.com/OpenLigaDB/OpenLigaDB-Samples
 * https://o7planning.org/en/10437/java-json-processing-api-tutorial
 */
public class RestClient {

  public static final String URI = "https://www.openligadb.de/api/";
  private Repo repo = Repo.getInstance();

  Client client = ClientBuilder.newClient();

  /**
   * https://www.openligadb.de/api/getavailableteams/bl1/2018
   *
   * @return
   */
  public int importAllTeams() {

    Response resp = client
            .target(URI)
            .path("getavailableteams/bl1/2018")
            .request(MediaType.APPLICATION_JSON)
            .get();

    String teams = resp.readEntity(String.class);

    // javax.json
    JsonArray teamsJson = Json.createReader(new StringReader(teams)).readArray();

    for (JsonValue val : teamsJson) {
      if (val.getValueType() == JsonValue.ValueType.OBJECT) {
        JsonObject o = val.asJsonObject();
        int id = o.getInt("TeamId");
        String name = o.getString("TeamName");
        String shortName = o.getString("ShortName");
        String iconUrl = o.getString("TeamIconUrl");
        repo.addTeam(new Team(id, name, shortName, iconUrl));
      }
    }

    System.out.println(teams);

    return resp.getStatus();

  }


}
