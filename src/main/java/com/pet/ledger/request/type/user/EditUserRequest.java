package com.pet.ledger.request.type.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pet.ledger.request.BaseRequest;
import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditUserRequest extends BaseRequest {
    @JsonProperty("email")
    private String email;

    @JsonProperty("name")
    private String name;

    @JsonProperty("family_name")
    private String familyName;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("skype")
    private String skype;
}
