package net.lingala.zip4j.examples;

import java.io.File;

public class TestUtil {

  public static File getFileFromResources(String fileName) {
    ClassLoader classLoader = new TestUtil().getClass().getClassLoader();
    return new File(classLoader.getResource(fileName).getFile());
  }

}
