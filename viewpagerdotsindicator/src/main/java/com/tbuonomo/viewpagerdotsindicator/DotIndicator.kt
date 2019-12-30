package com.tbuonomo.viewpagerdotsindicator

interface DotIndicator {
    fun getPhotos(): MutableList<Pair<Profile.Photo.Type?, String?>>
}