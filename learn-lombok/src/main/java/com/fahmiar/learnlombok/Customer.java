package com.fahmiar.learnlombok;

import lombok.*;

@Getter
@NoArgsConstructor(staticName = "createEmpty") // automatically create a private and static method
@AllArgsConstructor(staticName = "create")
@ToString
public class Customer {

    @Setter(AccessLevel.PROTECTED)
    private String name;
}
