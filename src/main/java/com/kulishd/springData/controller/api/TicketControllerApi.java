package com.kulishd.springData.controller.api;

import java.util.List;

import com.kulishd.springData.controller.TicketController;
import com.kulishd.springData.entity.Ticket;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

public interface TicketControllerApi {

    @Operation(summary = "get all tickets", responses = {
        @ApiResponse(responseCode = "200", description = "Successful Operation",
            content = @Content(mediaType = "application/json",
                schema = @Schema(implementation = TicketController.class)))})
    List<Ticket> getAllTickets();

    @Operation(summary = "get ticket by code", responses = {
        @ApiResponse(responseCode = "200", description = "Successful Operation",
            content = @Content(mediaType = "application/json",
                schema = @Schema(implementation = TicketController.class)))})
    Ticket findTicketByCode(String code);
}
