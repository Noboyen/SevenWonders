package com.example.sevenwonders;

import com.google.common.collect.ImmutableList;

public enum Material {

    Wood, //
    Paper, //
    Brick, //
    Stone, //
    Glass, //
    Gold; //

    public static ImmutableList<Material> allExceptGolds() {
        return ImmutableList.of(Wood, Paper, Brick, Stone, Glass);
    }

}