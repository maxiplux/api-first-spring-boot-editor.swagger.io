package com.example.apifirst.api;

import com.example.apifirst.model.SayHello200Response;
import com.example.apifirst.model.SayHelloRequest;
import jakarta.annotation.Generated;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link HelloApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-06T22:15:28.907398500-04:00[America/New_York]", comments = "Generator version: 7.13.0")
public interface HelloApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /hello : Say hello to a person
     * Returns a greeting message for the provided name
     *
     * @param sayHelloRequest  (required)
     * @return Successful operation (status code 200)
     * @see HelloApi#sayHello
     */
    default ResponseEntity<SayHello200Response> sayHello(SayHelloRequest sayHelloRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"hi John\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
