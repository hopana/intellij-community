package com.intellij.compiler;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.testFramework.PsiTestUtil;

import static com.intellij.util.io.TestFileSystemBuilder.fs;

/**
 * @author nik
 */
public class ModuleCompileScopeTest extends BaseCompilerTestCase {
  @Override
  protected boolean useExternalCompiler() {
    return true;
  }

  public void testCompileFile() {
    VirtualFile a = createFile("src/A.java", "class A{}");
    createFile("src/B.java", "class B{}");
    Module module = addModule("a", a.getParent());
    compile(true, a);
    assertOutput(module, fs().file("A.class"));
    make(module);
    assertOutput(module, fs().file("A.class").file("B.class"));
    assertModulesUpToDate();
  }

  public void testMakeTwoModules() {
    VirtualFile file1 = createFile("m1/src/A.java", "class A{}");
    Module m1 = addModule("m1", file1.getParent());
    VirtualFile file2 = createFile("m2/src/B.java", "class B{}");
    Module m2 = addModule("m2", file2.getParent());
    make(m1);
    assertOutput(m1, fs().file("A.class"));
    assertNoOutput(m2);
    make(m2);
    assertOutput(m2, fs().file("B.class"));
    assertModulesUpToDate();
  }

  public void testChangeExcludedFile() {
    VirtualFile a = createFile("src/a/A.java", "package a; class A{}");
    createFile("src/b/B.java", "package b; class B{}");
    Module m = addModule("m", a.getParent().getParent());
    PsiTestUtil.addExcludedRoot(m, a.getParent());
    make(m);
    assertOutput(m, fs().dir("b").file("B.class"));

    changeFile(a);
    make(m);
    assertOutput(m, fs().dir("b").file("B.class"));
  }
}
