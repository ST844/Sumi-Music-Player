package com.example.musicplayer.domain.usecase

import com.example.musicplayer.domain.service.MusicController
import javax.inject.Inject

class DestroyMediaControllerUseCase @InjectA
) {
    operator fun invoke() {
        musicController.destroy()
    }
}