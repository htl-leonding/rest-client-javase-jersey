package at.htl.restclient.rest;

import at.htl.restclient.repository.Repo;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class RestClientTest {

  private final RestClient restClient = new RestClient();
  private final Repo repo = Repo.getInstance();

  @Test
  void t010getAllTeams() {
    assertThat(restClient.importAllTeams(),is(200));
    assertThat(repo.countTeams(), is(18));
    System.out.println(repo.toStringTeams());
  }

}