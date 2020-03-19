/*------------------------------------------------------------------------------------------------*/
/*!

   @PROGRAM_ID       PropertyUtil.java
   @PROGRAM_NAME     경로 설정파일 로드 유틸리티
   @TEMPLATE
   @CONTENTS         경로 설정파일 로드

   @요청자
   @결재자
   @개발자           정병태

!*/

/*------------------------------------------------------------------------------------------------*/
/*                         P  R  O  G  R  A  M        H  I  S  T  O  R  Y                         */
/*------------------------------------------------------------------------------------------------*/
/*!
   @HISTORY          변경내용
   2014/12/09		 신규작성
   2015/03/09		 파일 헤더 주석 추가

!*/

package com.mts.hp.common;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

    public static String get(String name) {

        Resource resource = new ClassPathResource("/const.properties");
        Properties props = null;
        String property = null;
        try {
            props = PropertiesLoaderUtils.loadProperties(resource);
            property = props.getProperty(name);
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        return property;
    }
}
