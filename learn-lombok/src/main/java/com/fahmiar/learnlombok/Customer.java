package com.fahmiar.learnlombok;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Setter(AccessLevel.PROTECTED) @Getter
    private String name;
}
