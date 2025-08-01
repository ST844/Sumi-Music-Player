package com.example.musicplayer.domain.usecase

import javax.inject.Inject

class GetSongsUseCase @Inject constructor(private val musicRepository: MusicRepository) {
    operator fun invoke() = musicRepository.getSongs()
}