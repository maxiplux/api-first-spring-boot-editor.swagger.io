package com.example.apifirst.api;


import jakarta.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-06T22:15:28.907398500-04:00[America/New_York]", comments = "Generator version: 7.13.0")
@Controller
@RequestMapping("${openapi.helloWorld.base-path:}")
public class HelloApiController implements HelloApi {

    private final HelloApiDelegate delegate;

    public HelloApiController(@Autowired(required = false) HelloApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new HelloApiDelegate() {});
    }

    @Override
    public HelloApiDelegate getDelegate() {
        return delegate;
    }

}
