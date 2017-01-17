package es.juanlsanchez.instant.resource.rest;

import java.time.Instant;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.juanlsanchez.instant.resource.dto.HelloDTO;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class helloResource {

  @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<HelloDTO> get() {
    HelloDTO result = HelloDTO.builder().text("Hello!").instant(Instant.now()).build();
    log.debug("REST to hello with result: {}", result);
    return ResponseEntity.ok(result);
  }

}
