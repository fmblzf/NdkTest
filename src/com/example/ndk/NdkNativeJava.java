package com.example.ndk;

public class NdkNativeJava {
	
	static{
		System.loadLibrary("hello");
	}

	/**
	 * getCallResultByC:(jni���Է���). <br/>
	 * date: 2015��7��2�� <br/>
	 *
	 * @author zhaofeng
	 * @return
	 */
	public static native  String getCallResultByC();
	
	/**
	 * updateFile:(�������ļ����������ļ���д������Ϣ). <br/>
	 * date: 2015��7��2�� <br/>
	 *
	 * @author zhaofeng
	 * @param path
	 */
	public static native void updateFile(String path);
	
	/**
	 * writeFile:(��ָ���ļ���д����Ϣ). <br/>
	 * date: 2015��7��2�� <br/>
	 *
	 * @author zhaofeng
	 * @param file
	 * @param message
	 */
	public static native void writeFile(String file,String message);
	
	/**
	 * updateIntArray:(����jni����). <br/>
	 * date: 2015��7��2�� <br/>
	 *
	 * @author zhaofeng
	 * @param data
	 * @return
	 */
	public static native int[] updateIntArray(int[] data);
	/**
	 * updateIntArrayByPointer:(����jni���飬ͨ����������ָ��). <br/>
	 * date: 2015��7��2�� <br/>
	 *
	 * @author zhaofeng
	 * @param data
	 * @return
	 */
	public static native int[] updateIntArrayByPointer(int[] data);
	/**
	 * testJavahEclipseConfigTool:(������eclipse��javahѡ�����). <br/>
	 * date: 2015��7��2�� <br/>
	 *
	 * @author zhaofeng
	 */
	public static native void testJavahEclipseConfigTool();
}
