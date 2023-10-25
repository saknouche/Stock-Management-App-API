package com.sadev.gestionDeStock.handler;

import com.sadev.gestionDeStock.exception.ErrorCodes;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorDto {
    private Integer httpCode;
    private ErrorCodes code;
    private String message;
    private List<String> errors = new ArrayList<>();
}
