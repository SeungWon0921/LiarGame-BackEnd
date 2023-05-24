package com.api.liargame.controller.dto.request;

import com.api.liargame.domain.Setting;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SettingRequestDto {
    String roomId;
    String userId;
    Setting setting;
}
