package org.example.exeption;

import java.time.LocalDateTime;

public record CustomErrorMessage(
        String message,
        LocalDateTime timestamp
) {
}
