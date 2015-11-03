/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.refactoring.pullUp;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class PullUpTestGenerated extends AbstractPullUpTest {
    @TestMetadata("idea/testData/refactoring/pullUp/k2k")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class K2K extends AbstractPullUpTest {
        @TestMetadata("accidentalOverrides.kt")
        public void testAccidentalOverrides() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/accidentalOverrides.kt");
            doKotlinTest(fileName);
        }

        public void testAllFilesPresentInK2K() throws Exception {
            KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/pullUp/k2k"), Pattern.compile("^(.+)\\.kt$"));
        }

        @TestMetadata("clashWithSuper.kt")
        public void testClashWithSuper() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/clashWithSuper.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("fromClassToClass.kt")
        public void testFromClassToClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/fromClassToClass.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("fromClassToClassMakeAbstract.kt")
        public void testFromClassToClassMakeAbstract() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/fromClassToClassMakeAbstract.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("fromClassToClassWithGenerics.kt")
        public void testFromClassToClassWithGenerics() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/fromClassToClassWithGenerics.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("fromClassToInterface.kt")
        public void testFromClassToInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/fromClassToInterface.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("fromClassToInterfaceMakeAbstract.kt")
        public void testFromClassToInterfaceMakeAbstract() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/fromClassToInterfaceMakeAbstract.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("implicitCompanionUsages.kt")
        public void testImplicitCompanionUsages() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/implicitCompanionUsages.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("inaccessibleMemberUsed.kt")
        public void testInaccessibleMemberUsed() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/inaccessibleMemberUsed.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("initializerInConstructor.kt")
        public void testInitializerInConstructor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/initializerInConstructor.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("initializerInMultipleConstructorsEq.kt")
        public void testInitializerInMultipleConstructorsEq() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/initializerInMultipleConstructorsEq.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("initializerInMultipleConstructorsNonEq.kt")
        public void testInitializerInMultipleConstructorsNonEq() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/initializerInMultipleConstructorsNonEq.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("innerClassToInterface.kt")
        public void testInnerClassToInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/innerClassToInterface.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("moveAllSuperInterfaces.kt")
        public void testMoveAllSuperInterfaces() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/moveAllSuperInterfaces.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("moveAllSuperInterfacesWithGenerics.kt")
        public void testMoveAllSuperInterfacesWithGenerics() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/moveAllSuperInterfacesWithGenerics.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("moveSuperInterfaces.kt")
        public void testMoveSuperInterfaces() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/moveSuperInterfaces.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("moveSuperInterfacesToEmptySpecifierList.kt")
        public void testMoveSuperInterfacesToEmptySpecifierList() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/moveSuperInterfacesToEmptySpecifierList.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("moveSuperInterfaceToItSelf.kt")
        public void testMoveSuperInterfaceToItSelf() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/moveSuperInterfaceToItSelf.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("multipleInitializersInConstructorsEq.kt")
        public void testMultipleInitializersInConstructorsEq() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/multipleInitializersInConstructorsEq.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("noCaret.kt")
        public void testNoCaret() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/noCaret.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("noClashWithAbstractSuper.kt")
        public void testNoClashWithAbstractSuper() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/noClashWithAbstractSuper.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("noInitializationInInterface.kt")
        public void testNoInitializationInInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/noInitializationInInterface.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("noSuperClass.kt")
        public void testNoSuperClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/noSuperClass.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("outsideOfClass.kt")
        public void testOutsideOfClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/outsideOfClass.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("parametersInPrimaryInitializer.kt")
        public void testParametersInPrimaryInitializer() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/parametersInPrimaryInitializer.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("propertyDependenceSatisfied.kt")
        public void testPropertyDependenceSatisfied() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/propertyDependenceSatisfied.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("propertyDependenceUnsatisfied.kt")
        public void testPropertyDependenceUnsatisfied() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/propertyDependenceUnsatisfied.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("publicToInterface.kt")
        public void testPublicToInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/publicToInterface.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("superToThis.kt")
        public void testSuperToThis() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/superToThis.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("toIndirectSuperClass.kt")
        public void testToIndirectSuperClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/toIndirectSuperClass.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("usedPrivateToClass.kt")
        public void testUsedPrivateToClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2k/usedPrivateToClass.kt");
            doKotlinTest(fileName);
        }
    }

    @TestMetadata("idea/testData/refactoring/pullUp/k2j")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class K2J extends AbstractPullUpTest {
        public void testAllFilesPresentInK2J() throws Exception {
            KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/pullUp/k2j"), Pattern.compile("^(.+)\\.kt$"));
        }

        @TestMetadata("fromClassToClass.kt")
        public void testFromClassToClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2j/fromClassToClass.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("fromClassToClassAndMakeAbstract.kt")
        public void testFromClassToClassAndMakeAbstract() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2j/fromClassToClassAndMakeAbstract.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("fromClassToClassWithGenerics.kt")
        public void testFromClassToClassWithGenerics() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2j/fromClassToClassWithGenerics.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("fromClassToInterface.kt")
        public void testFromClassToInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2j/fromClassToInterface.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("fromClassToNestedClass.kt")
        public void testFromClassToNestedClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2j/fromClassToNestedClass.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("moveSuperInterfacesToClass.kt")
        public void testMoveSuperInterfacesToClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2j/moveSuperInterfacesToClass.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("moveSuperInterfacesToInterface.kt")
        public void testMoveSuperInterfacesToInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2j/moveSuperInterfacesToInterface.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("moveSuperInterfacesWithGenerics.kt")
        public void testMoveSuperInterfacesWithGenerics() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2j/moveSuperInterfacesWithGenerics.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("publicToInterface.kt")
        public void testPublicToInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2j/publicToInterface.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("usedPrivateToClass.kt")
        public void testUsedPrivateToClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/k2j/usedPrivateToClass.kt");
            doKotlinTest(fileName);
        }
    }

    @TestMetadata("idea/testData/refactoring/pullUp/j2k")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class J2K extends AbstractPullUpTest {
        public void testAllFilesPresentInJ2K() throws Exception {
            KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/pullUp/j2k"), Pattern.compile("^(.+)\\.java$"));
        }

        @TestMetadata("fromClassToClass.java")
        public void testFromClassToClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/j2k/fromClassToClass.java");
            doJavaTest(fileName);
        }

        @TestMetadata("fromClassToClassAndMakeAbstract.java")
        public void testFromClassToClassAndMakeAbstract() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/j2k/fromClassToClassAndMakeAbstract.java");
            doJavaTest(fileName);
        }

        @TestMetadata("fromClassToClassWithGenerics.java")
        public void testFromClassToClassWithGenerics() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/j2k/fromClassToClassWithGenerics.java");
            doJavaTest(fileName);
        }

        @TestMetadata("fromClassToInterface.java")
        public void testFromClassToInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/j2k/fromClassToInterface.java");
            doJavaTest(fileName);
        }

        @TestMetadata("fromClassToInterfaceWithConflicts.java")
        public void testFromClassToInterfaceWithConflicts() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/j2k/fromClassToInterfaceWithConflicts.java");
            doJavaTest(fileName);
        }

        @TestMetadata("fromClassToNestedClass.java")
        public void testFromClassToNestedClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/j2k/fromClassToNestedClass.java");
            doJavaTest(fileName);
        }

        @TestMetadata("moveSuperInterfacesToClass.java")
        public void testMoveSuperInterfacesToClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/j2k/moveSuperInterfacesToClass.java");
            doJavaTest(fileName);
        }

        @TestMetadata("moveSuperInterfacesToInterface.java")
        public void testMoveSuperInterfacesToInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/j2k/moveSuperInterfacesToInterface.java");
            doJavaTest(fileName);
        }

        @TestMetadata("moveSuperInterfacesWithGenerics.java")
        public void testMoveSuperInterfacesWithGenerics() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pullUp/j2k/moveSuperInterfacesWithGenerics.java");
            doJavaTest(fileName);
        }
    }
}
