package com.youwin.yws.util;

                       /*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.util.StringUtility;

public class MyCommentGenerator implements CommentGenerator {

    private Properties properties;
    private boolean suppressAllComments;

    public MyCommentGenerator() {
        super();
        properties = new Properties();
        suppressAllComments = false;
    }

    public void addJavaFileComment(CompilationUnit compilationUnit) {
        return;
    }

    /**
     * xml中的注释
     *
     * @param xmlElement
     */
    public void addComment(XmlElement xmlElement) {
        if (suppressAllComments) {
            return;
        }
        xmlElement.addElement(new TextElement("<!--"));
        StringBuilder sb = new StringBuilder();
        sb.append("  WARNING - ");
        sb.append(MergeConstants.NEW_ELEMENT_TAG);
        //xmlElement.
        
        xmlElement.addElement(new TextElement(sb.toString()));
        xmlElement.addElement(new TextElement("-->"));
    }
    

    public void addRootComment(XmlElement rootElement) {
        return;
    }

    public void addConfigurationProperties(Properties properties) {
        this.properties.putAll(properties);
        suppressAllComments = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
    }

    /**
     * 删除标记
     *
     * @param javaElement
     * @param markAsDoNotDelete
     */
    protected void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete) {
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append(MergeConstants.NEW_ELEMENT_TAG);
        if (markAsDoNotDelete) {
            sb.append(" do_not_delete_during_merge");
        }
        javaElement.addJavaDocLine(sb.toString());
    }

    /**
     * Example使用
     *
     * @param innerClass
     * @param introspectedTable
     */
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }
    }

    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }
    }

    /**
     * 给字段添加数据库备注
     *
     * @param field
     * @param introspectedTable
     * @param introspectedColumn
     */
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
            field.addJavaDocLine("/**");
            StringBuilder sb = new StringBuilder();
            sb.append(" * ");
            sb.append(introspectedColumn.getRemarks());
            field.addJavaDocLine(sb.toString());
            field.addJavaDocLine(" */");
        }
        //添加注解
        /*
        if (field.isTransient()) {
            //@Column
            field.addAnnotation("@Transient");
        }
        for (IntrospectedColumn column : introspectedTable.getPrimaryKeyColumns()) {
            if (introspectedColumn == column) {
                field.addAnnotation("@Id");
                break;
            }
        }
        String column = introspectedColumn.getActualColumnName();
        if (StringUtility.stringContainsSpace(column) || introspectedTable.getTableConfiguration().isAllColumnDelimitingEnabled()) {
            column = introspectedColumn.getContext().getBeginningDelimiter()
                    + column
                    + introspectedColumn.getContext().getEndingDelimiter();
        }
        if (!column.equals(introspectedColumn.getJavaProperty())) {
            //@Column
            field.addAnnotation("@Column(name = \"" + column + "\")");
        }
        if (introspectedColumn.isIdentity()) {
            field.addAnnotation("@GeneratedValue(strategy = GenerationType.IDENTITY)");
        } else if (introspectedColumn.isSequenceColumn()) {
            field.addAnnotation("@SequenceGenerator(name=\"\",sequenceName=\"" + introspectedTable.getTableConfiguration().getGeneratedKey().getRuntimeSqlStatement() + "\")");
        }
        */
    }

    /**
     * Example使用
     *
     * @param field
     * @param introspectedTable
     */
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }
    }

    /**
     * @param method
     * @param introspectedTable
     */
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }
        
        //11/08
		StringBuilder sb = new StringBuilder();
		method.addJavaDocLine("/**"); //$NON-NLS-1$
		//        method.addJavaDocLine(" * This method was generated by MyBatis Generator."); //$NON-NLS-1$

		//        sb.append(" * This method corresponds to the database table "); //$NON-NLS-1$
		sb.append(" * ");
		if (method.isConstructor()) {
			sb.append(" 构造查询条件");
		}
		String method_name = method.getName();
		if ("setOrderByClause".equals(method_name)) {
			sb.append(" 设置排序字段");
		} else if ("setDistinct".equals(method_name)) {
			sb.append(" 设置过滤重复数据");
		} else if ("getOredCriteria".equals(method_name)) {
			sb.append(" 获取当前的查询条件实例");
		} else if ("isDistinct".equals(method_name)) {
			sb.append(" 是否过滤重复数据");
		} else if ("getOrderByClause".equals(method_name)) {
			sb.append(" 获取排序字段");
		} else if ("createCriteria".equals(method_name)) {
			sb.append(" 创建一个查询条件");
		} else if ("createCriteriaInternal".equals(method_name)) {
			sb.append(" 内部构建查询条件对象");
		} else if ("clear".equals(method_name)) {
			sb.append(" 清除查询条件");
		} else if ("countByExample".equals(method_name)) {
			sb.append(" 根据指定的条件获取数据库记录数");
		} else if ("deleteByExample".equals(method_name)) {
			sb.append(" 根据指定的条件删除数据库符合条件的记录");
		} else if ("deleteByPrimaryKey".equals(method_name)) {
			sb.append(" 根据主键删除数据库的记录");
		} else if ("insert".equals(method_name)) {
			sb.append(" 新写入数据库记录");
		} else if ("insertSelective".equals(method_name)) {
			sb.append(" 动态字段,写入数据库记录");
		} else if ("selectByExample".equals(method_name)) {
			sb.append(" 根据指定的条件查询符合条件的数据库记录");
		} else if ("selectByPrimaryKey".equals(method_name)) {
			sb.append(" 根据指定主键获取一条数据库记录");
		} else if ("updateByExampleSelective".equals(method_name)) {
			sb.append(" 动态根据指定的条件来更新符合条件的数据库记录");
		} else if ("updateByExample".equals(method_name)) {
			sb.append(" 根据指定的条件来更新符合条件的数据库记录");
		} else if ("updateByPrimaryKeySelective".equals(method_name)) {
			sb.append(" 动态字段,根据主键来更新符合条件的数据库记录");
		} else if ("updateByPrimaryKey".equals(method_name)) {
			sb.append(" 根据主键来更新符合条件的数据库记录");
		}
		sb.append(",");
		sb.append(introspectedTable.getFullyQualifiedTable());
		method.addJavaDocLine(sb.toString());

		final List<Parameter> parameterList = method.getParameters();
		if (!parameterList.isEmpty()) {
			method.addJavaDocLine(" *");
			if ("or".equals(method_name)) {
				sb.append(" 增加或者的查询条件,用于构建或者查询");
			}
		} else {
			if ("or".equals(method_name)) {
				sb.append(" 创建一个新的或者查询条件");
			}
		}
		String paramterName;
		for (Parameter parameter : parameterList) {
			sb.setLength(0);
			sb.append(" * @param "); //$NON-NLS-1$
			paramterName = parameter.getName();
			sb.append(paramterName);
			if ("orderByClause".equals(paramterName)) {
				sb.append(" 排序字段"); //$NON-NLS-1$
			} else if ("distinct".equals(paramterName)) {
				sb.append(" 是否过滤重复数据");
			} else if ("criteria".equals(paramterName)) {
				sb.append(" 过滤条件实例");
			}
			method.addJavaDocLine(sb.toString());
		}

		// addJavadocTag(method, false);

		method.addJavaDocLine(" */"); //$NON-NLS-1$
    }

    /**
     * getter方法注释
     *
     * @param method
     * @param introspectedTable
     * @param introspectedColumn
     */
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        method.addJavaDocLine("/**");
        if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
            sb.append(" * 获取");
            sb.append(introspectedColumn.getRemarks());
            method.addJavaDocLine(sb.toString());
            method.addJavaDocLine(" *");
        }
        sb.setLength(0);
        sb.append(" * @return ");
        sb.append(introspectedColumn.getActualColumnName());
        if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
            sb.append(" - ");
            sb.append(introspectedColumn.getRemarks());
        }
        method.addJavaDocLine(sb.toString());
        method.addJavaDocLine(" */");
    }

    /**
     * setter方法注释
     *
     * @param method
     * @param introspectedTable
     * @param introspectedColumn
     */
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        method.addJavaDocLine("/**");
        if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
            sb.append(" * 设置");
            sb.append(introspectedColumn.getRemarks());
            method.addJavaDocLine(sb.toString());
            method.addJavaDocLine(" *");
        }
        Parameter parm = method.getParameters().get(0);
        sb.setLength(0);
        sb.append(" * @param ");
        sb.append(parm.getName());
        if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
            sb.append(" ");
            sb.append(introspectedColumn.getRemarks());
        }
        method.addJavaDocLine(sb.toString());
        method.addJavaDocLine(" */");
    }

    /**
     * Example使用
     *
     * @param innerClass
     * @param introspectedTable
     * @param markAsDoNotDelete
     */
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
        if (suppressAllComments) {
            return;
        }
    }
}
