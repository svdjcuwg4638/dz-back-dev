package com.dz.factory.common.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${JAWSDB_MARIA_URL}")
    private String jawsDbMariaUrl;

    @Value("${JawsDB_PASSWORD}")
    private String jawsDbPassword;

    @Value("${JawsDB_URL}")
    private String jawsDbUrl;

    @Value("${JawsDB_USER}")
    private String jawsDbUser;

    @GetMapping("/config")
    public ConfigResponse getConfig() {
        return new ConfigResponse(jawsDbMariaUrl, jawsDbPassword, jawsDbUrl, jawsDbUser);
    }

    public static class ConfigResponse {
        private final String jawsDbMariaUrl;
        private final String jawsDbPassword;
        private final String jawsDbUrl;
        private final String jawsDbUser;

        public ConfigResponse(String jawsDbMariaUrl, String jawsDbPassword, String jawsDbUrl, String jawsDbUser) {
            this.jawsDbMariaUrl = jawsDbMariaUrl;
            this.jawsDbPassword = jawsDbPassword;
            this.jawsDbUrl = jawsDbUrl;
            this.jawsDbUser = jawsDbUser;
        }

        public String getJawsDbMariaUrl() {
            return jawsDbMariaUrl;
        }

        public String getJawsDbPassword() {
            return jawsDbPassword;
        }

        public String getJawsDbUrl() {
            return jawsDbUrl;
        }

        public String getJawsDbUser() {
            return jawsDbUser;
        }
    }
}
