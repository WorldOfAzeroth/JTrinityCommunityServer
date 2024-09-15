package com.github.jtrinity.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Logs {
     Logger sql = LoggerFactory.getLogger("sqlLogger");
     Logger SERVER_LOADING = LoggerFactory.getLogger("server.loading");

}
