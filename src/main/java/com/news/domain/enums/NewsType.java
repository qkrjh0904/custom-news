package com.news.domain.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum NewsType {
    EXCLUSIVE("[단독]");

    private final String description;
}
