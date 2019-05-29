package com.isolator.cases;

import lombok.Value;

import java.util.List;

@Value
public class Transaction {

    private List<Writer> writers;
}
