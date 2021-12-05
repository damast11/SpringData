package com.kulishd.springData.controller.api;

import java.util.List;

import com.kulishd.springData.controller.EventController;
import com.kulishd.springData.entity.Event;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

public interface EventControllerApi {

    @Operation(summary = "get all events", responses = {
        @ApiResponse(responseCode = "200", description = "Successful Operation",
            content = @Content(mediaType = "application/json",
                schema = @Schema(implementation = EventController.class)))})
    List<Event> getAllEvents();

    @Operation(summary = "find events by name", responses = {
        @ApiResponse(responseCode = "200", description = "Successful Operation",
            content = @Content(mediaType = "application/json",
                schema = @Schema(implementation = EventController.class)))})
    Event findEventByName(String name);
}
