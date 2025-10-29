package com.fahmiar.learnlombok;

import lombok.*;

@Getter
@NoArgsConstructor(staticName = "createEmpty") // automatically create a private and static method
@AllArgsConstructor(staticName = "create")
@ToString(exclude = {
        "password"
        // ... other
}) // password will not be shown on the result when printing the customer variable
public class Customer {

    @Setter(AccessLevel.PROTECTED)
    private String name;

    @Setter(AccessLevel.PROTECTED)
    private String password;
}
