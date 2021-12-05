package com.kulishd.springData.controller.api;

import java.util.List;

import com.kulishd.springData.controller.BookingController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

public interface BookingControllerApi {

    @Operation(summary = "book tickets", responses = {
        @ApiResponse(responseCode = "200", description = "Successful Operation",
            content = @Content(mediaType = "application/json",
                schema = @Schema(implementation = BookingController.class)))})
    List<String> bookTickets(String event, String userName, int count);
}
