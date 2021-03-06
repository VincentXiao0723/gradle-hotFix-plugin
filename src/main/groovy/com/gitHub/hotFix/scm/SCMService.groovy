package com.gitHub.hotFix.scm

import com.gitHub.hotFix.model.ProjectSCM
import com.gitHub.hotFix.scm.model.ChangeFileSet

interface SCMService {
	
	/**
	 * 获取SCM log 用于生成hotFix
	 * @param scmInfo
	 * @param startRevision
	 * @param endRevision
	 * @param targetPath 需要获取log的path
	 * @return
	 */
	ChangeFileSet getChangeFileSet(ProjectSCM scmInfo, String startRevision, String endRevision, String targetPath) 
	
}
