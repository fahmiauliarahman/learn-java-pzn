package com.fahmiar.learnlombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Customer {

    @Setter(AccessLevel.PROTECTED) @Getter
    private String name;
}
