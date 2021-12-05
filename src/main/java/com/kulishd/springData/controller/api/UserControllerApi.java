package com.kulishd.springData.controller.api;

import java.util.List;

import com.kulishd.springData.controller.UserController;
import com.kulishd.springData.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

public interface UserControllerApi {

    @Operation(summary = "get all users", responses = {
        @ApiResponse(responseCode = "200", description = "Successful Operation",
            content = @Content(mediaType = "application/json",
                schema = @Schema(implementation = UserController.class)))})
    List<User> getAllUsers();

    @Operation(summary = "get user by name", responses = {
        @ApiResponse(responseCode = "200", description = "Successful Operation",
            content = @Content(mediaType = "application/json",
                schema = @Schema(implementation = UserController.class)))})
    User findUserByName(String name);
}
