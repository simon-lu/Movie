package com.dream.service;

import com.dream.common.E3Result;
import org.springframework.stereotype.Service;

/**
 * Created by ZXL on 2018/3/2.
 */

public interface AdminService {
    E3Result adminLogin(String adminname, String adminpassword);
}
