package com.epion_t3.ssh.configuration.model;

import com.epion_t3.core.common.annotation.CustomConfigurationDefinition;
import com.epion_t3.core.common.bean.scenario.Configuration;
import lombok.Getter;
import lombok.Setter;
import org.apache.bval.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * SSH接続情報.
 *
 * @author takashno
 */
@Getter
@Setter
@CustomConfigurationDefinition(id = "SshConnectionConfiguration")
public class SshConnectionConfiguration extends Configuration {

    /**
     * DefaultSerialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * ホスト.
     */
    @NotEmpty
    private String host;

    /**
     * 接続ポート.
     */
    @NotNull
    private Integer port;

    /**
     * ユーザ.
     */
    private String user;

    /**
     * パスワード.
     */
    private String password;

    /**
     * 公開鍵ファイルパス.
     */
    private String pemFilePath;

    /**
     * アルゴリズム.
     */
    private String algorithm;

    /**
     * パスフレーズ.
     */
    private String passPhrase;

    /**
     * 認証タイプ.
     */
    @NotEmpty
    private String authType;

    /**
     * 改行コード.
     */
    private String lineSeparator;
}
