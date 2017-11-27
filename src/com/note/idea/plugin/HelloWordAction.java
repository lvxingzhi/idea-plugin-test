package com.note.idea.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * <p>TODO </p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author lvxz5
 * @version 1.0
 * @date 2017/3/21
 * @since 1.0
 */
public class HelloWordAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        Project project = anActionEvent.getProject();
        String userName = Messages.showInputDialog(project,"what is your name?","input your name",Messages.getQuestionIcon());
        Messages.showMessageDialog(project,String.format("hello, %s!\n welcome to idea plugin develop world",userName),"information",Messages.getInformationIcon());
    }
}
