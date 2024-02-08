package com.bookmyshow.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.ResponseStatus;
@Setter
@Getter
@AllArgsConstructor
public class SignUpUserDtoResponse {
    private Long id;
    private ResponseStatus responseStatus;
}
