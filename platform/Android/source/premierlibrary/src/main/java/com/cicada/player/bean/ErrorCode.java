package com.cicada.player.bean;

/*
 * Copyright (C) 2010-2017 Alibaba Group Holding Limited.
 */
public enum ErrorCode {

    ERROR_DEMUXER_START(0x20030000),

    ERROR_DEMUXER_OPENURL(0x20030001),

    ERROR_DEMUXER_NO_VALID_STREAM(0x20030002),

    ERROR_DEMUXER_OPENSTREAM(0x20030003),

    ERROR_LOADING_TIMEOUT(0x20030004),

    ERROR_DATASOURCE_EMPTYURL(0x20030005),

    ERROR_DECODE_BASE(0x20040000),

    ERROR_DECODE_VIDEO(0x20040001),

    ERROR_DECODE_AUDIO(0x20040002),

    ERROR_NETWORK_UNKNOWN(0x20050000),

    ERROR_NETWORK_UNSUPPORTED(0x20050001),

    ERROR_NETWORK_RESOLVE(0x20050002),

    ERROR_NETWORK_CONNECT_TIMEOUT(0x20050003),

    ERROR_NETWORK_COULD_NOT_CONNECT(0x20050004),

    ERROR_NETWORK_HTTP_403(0x20050005),

    ERROR_NETWORK_HTTP_404(0x20050006),

    ERROR_NETWORK_HTTP_4XX(0x20050007),

    ERROR_NETWORK_HTTP_5XX(0x20050008),

    ERROR_NETWORK_HTTP_RANGE(0x20050009),

    ERROR_NETWORK_HTTP_400( 0x2005000A),


    ERROR_CODEC_UNKNOWN(0x20060000),

    ERROR_CODEC_VIDEO_NOT_SUPPORT(0x20060001),

    ERROR_CODEC_AUDIO_NOT_SUPPORT(0x20060002),

    ERROR_INERNAL_UNKNOWN(0x20070000),

    ERROR_INERNAL_EXIT(0x20070001),

    ERROR_GENERAL_UNKNOWN(0x20080000),

    ERROR_GENERAL_EPERM(0x20080001),

    ERROR_GENERAL_ENOENT(0x20080002),

    ERROR_GENERAL_EIO(0x20080005),

    //
    ERROR_UNKNOWN(0x30000000 - 1),

    ;

    private int mCode;

    private ErrorCode(int value) {
        mCode = value;
    }

    public int getValue() {
        return mCode;
    }


}