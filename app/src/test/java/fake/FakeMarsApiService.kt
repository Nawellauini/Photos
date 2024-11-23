package com.example.marsphotos.fake


import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApiService
import fake.FakeDataSource

class FakeMarsApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
