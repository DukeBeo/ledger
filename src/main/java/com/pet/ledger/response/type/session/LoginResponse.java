package com.pet.ledger.response.type.session;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pet.ledger.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LoginResponse extends BaseResponse {
    @JsonProperty("token")
    private String token;
    private String name;
    private String picture;
}
