package com.example.views.Utilities

import com.example.views.Model.Category
import com.example.views.Model.Product

object DataServices {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")

    )

    val hats = listOf(
        Product("Devslopes Grafic Beanie","$18","hat01"),
        Product("Devslopes Hat Black","$20","hat02"),
        Product("Devslopes Hat White","$22","hat03"),
        Product("Devslopes Hat Snapback","$24","hat04"),
        Product("Devslopes Grafic Beanie","$18","hat01"),
        Product("Devslopes Hat Black","$20","hat02"),
        Product("Devslopes Hat White","$22","hat03"),
        Product("Devslopes Hat Snapback","$24","hat04")
    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie01"),
        Product("Devslopes Hoodie Red","$32","hoodie02"),
        Product("Devslopes Hoodie Gray","$28","hoodie03"),
        Product("Devslopes Hoodie Black","$32","hoodie04"),
        Product("Devslopes Hoodie Gray","$28","hoodie01"),
        Product("Devslopes Hoodie Red","$32","hoodie02"),
        Product("Devslopes Hoodie Gray","$28","hoodie03"),
        Product("Devslopes Hoodie Black","$32","hoodie04")

    )
    val shirts = listOf( Product("Devslopes shirt Gray","$17","shirt01"),
        Product("Devslopes badge light gray","$18","shirt02"),
        Product("Devslopes logo shirt red","$19","shirt03"),
        Product("Devslopes Hoodie hustle","$20","shirt04"),
        Product("KickFlip Studio","$18","shirts05"),
        Product("Devslopes badge light gray","$18","shirt02"),
        Product("Devslopes logo shirt red","$19","shirt03"),
        Product("Devslopes Hoodie hustle","$20","shirt04"),
        Product("KickFlip Studio","$18","shirts05")

    )

}