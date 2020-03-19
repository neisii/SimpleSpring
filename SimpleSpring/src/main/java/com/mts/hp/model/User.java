/*------------------------------------------------------------------------------------------------*/
/*!

   @PROGRAM_ID       User.java
   @PROGRAM_NAME     유저 객체
   @TEMPLATE
   @CONTENTS         유저 객체(TBL_MSGUSER 테이블 객체)

   @요청자
   @결재자
   @개발자           	 서혜영

!*/

/*------------------------------------------------------------------------------------------------*/
/*                         P  R  O  G  R  A  M        H  I  S  T  O  R  Y                         */
/*------------------------------------------------------------------------------------------------*/
/*!
   @HISTORY          변경내용
   2016/10/12		 신규작성
   2017/02/21		 테이블 변경에 따른 변수 모델 재작성

!*/
package com.mts.hp.model;

import java.util.List;

public class User {

	private Integer compSeq;		// 고객사 시퀀스
    private String userId;			// 사용자 아이디
    private String userAuthCode;	// 권한 코드
    private String userAuthCodeEtc;	// 기타 권한 코드
    private String userAuthName;	// 유저권한명
    private Integer deptNum;		// 부서 일련번호
    private String deptName;		// 부서명
    private String userPw;			// 패스워드
    private String userName;		// 사용자명
    private String phoneNum;		// 연락처
    private String pointUseYn;		// 포인트사용 여부
    private String userStatCode;	// 계정 상태 코드
    private String userStatName;	// 계정 상태 명
    private String useYn;			// 사용 여부
    private String regDate;			// 최초 등록일시
    private String regUserId;		// 최초 등록자
    private String modDate;			// 최종 수정일시
    private String modUserId;		// 최종 수정자
    private Integer userSeq;		// 사용자 시퀀스
    
    private String compName;		// 고객사명
    
    private Integer lastPoint;		// 최종포인트
    private Integer originalPoint;	// 변경전포인트
    
    List<Integer> deleteList;		// 선택삭제 List
    
    private String authIpYn;		// 아이피 허용 여부
    private String remoteIp;		// 접속 아이피
    
    private Integer moveDeptNum;	// 이동 부서 일련번호
    
	public Integer getCompSeq() {
		return compSeq;
	}
	public void setCompSeq(Integer compSeq) {
		this.compSeq = compSeq;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserAuthCode() {
		return userAuthCode;
	}
	public void setUserAuthCode(String userAuthCode) {
		this.userAuthCode = userAuthCode;
	}
	public String getUserAuthCodeEtc() {
		return userAuthCodeEtc;
	}
	public void setUserAuthCodeEtc(String userAuthCodeEtc) {
		this.userAuthCodeEtc = userAuthCodeEtc;
	}
	public String getUserAuthName() {
		return userAuthName;
	}
	public void setUserAuthName(String userAuthName) {
		this.userAuthName = userAuthName;
	}
	public Integer getDeptNum() {
		return deptNum;
	}
	public void setDeptNum(Integer deptNum) {
		this.deptNum = deptNum;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getPointUseYn() {
		return pointUseYn;
	}
	public void setPointUseYn(String pointUseYn) {
		this.pointUseYn = pointUseYn;
	}
	public String getUserStatCode() {
		return userStatCode;
	}
	public void setUserStatCode(String userStatCode) {
		this.userStatCode = userStatCode;
	}
	public String getUserStatName() {
		return userStatName;
	}
	public void setUserStatName(String userStatName) {
		this.userStatName = userStatName;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getRegUserId() {
		return regUserId;
	}
	public void setRegUserId(String regUserId) {
		this.regUserId = regUserId;
	}
	public String getModDate() {
		return modDate;
	}
	public void setModDate(String modDate) {
		this.modDate = modDate;
	}
	public String getModUserId() {
		return modUserId;
	}
	public void setModUserId(String modUserId) {
		this.modUserId = modUserId;
	}
	public Integer getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(Integer userSeq) {
		this.userSeq = userSeq;
	}
	public List<Integer> getDeleteList() {
		return deleteList;
	}
	public void setDeleteList(List<Integer> deleteList) {
		this.deleteList = deleteList;
	}
	public Integer getLastPoint() {
		return lastPoint;
	}
	public void setLastPoint(Integer lastPoint) {
		this.lastPoint = lastPoint;
	}
	public Integer getOriginalPoint() {
		return originalPoint;
	}
	public void setOriginalPoint(Integer originalPoint) {
		this.originalPoint = originalPoint;
	}
	public String getAuthIpYn() {
		return authIpYn;
	}
	public void setAuthIpYn(String authIpYn) {
		this.authIpYn = authIpYn;
	}
	public String getRemoteIp() {
		return remoteIp;
	}
	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}
	public Integer getMoveDeptNum() {
		return moveDeptNum;
	}
	public void setMoveDeptNum(Integer moveDeptNum) {
		this.moveDeptNum = moveDeptNum;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	
    
}
