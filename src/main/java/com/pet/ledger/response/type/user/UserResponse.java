package com.pet.ledger.response.type.user;

import com.pet.ledger.model.type.User;
import com.pet.ledger.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserResponse extends BaseResponse {
    private User user;
}
