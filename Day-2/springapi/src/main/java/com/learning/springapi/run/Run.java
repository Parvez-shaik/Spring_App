package com.learning.springapi.run;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record Run(
        Integer Id,
        @NotNull
        String name,
        @Positive
        Integer miles,
        Location location
) {
}
