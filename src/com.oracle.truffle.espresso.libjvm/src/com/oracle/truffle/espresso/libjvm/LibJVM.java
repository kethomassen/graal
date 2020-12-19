/*
 * Copyright (c) 2020, 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.truffle.espresso.libjvm;

import com.oracle.svm.core.annotate.Uninterruptible;
import com.oracle.truffle.espresso.libjvm.nativeapi.JNIVersion;

public class LibJVM {
    // Checkstyle: stop method name check

    // * "Forte" profiler API
    // AsyncGetCallTrace

    // * JNI invocation API

    @Uninterruptible(reason = "called from Uninterruptible")
    public static boolean isSupportedJniVersion(int version) {
        int javaSpecVersion = JNIVersion.javaSpecVersion(version);
        return 0 <= javaSpecVersion && javaSpecVersion <= JavaVersionUtil.JAVA_SPEC;
    }

    // * Internal JIO
    // jio_fprintf
    // jio_printf
    // jio_snprintf
    // jio_vfprintf
    // jio_vsnprintf
    // numa_error
    // numa_warn

    // * Internal JVM
    // JVM_ActiveProcessorCount
    // JVM_AddModuleExports
    // JVM_AddModuleExportsToAll
    // JVM_AddModuleExportsToAllUnnamed
    // JVM_AddReadsModule
    // JVM_AreNestMates
    // JVM_ArrayCopy
    // JVM_AssertionStatusDirectives
    // JVM_BeforeHalt
    // JVM_CallStackWalk
    // JVM_Clone
    // JVM_ConstantPoolGetClassAt
    // JVM_ConstantPoolGetClassAtIfLoaded
    // JVM_ConstantPoolGetClassRefIndexAt
    // JVM_ConstantPoolGetDoubleAt
    // JVM_ConstantPoolGetFieldAt
    // JVM_ConstantPoolGetFieldAtIfLoaded
    // JVM_ConstantPoolGetFloatAt
    // JVM_ConstantPoolGetIntAt
    // JVM_ConstantPoolGetLongAt
    // JVM_ConstantPoolGetMemberRefInfoAt
    // JVM_ConstantPoolGetMethodAt
    // JVM_ConstantPoolGetMethodAtIfLoaded
    // JVM_ConstantPoolGetNameAndTypeRefIndexAt
    // JVM_ConstantPoolGetNameAndTypeRefInfoAt
    // JVM_ConstantPoolGetSize
    // JVM_ConstantPoolGetStringAt
    // JVM_ConstantPoolGetTagAt
    // JVM_ConstantPoolGetUTF8At
    // JVM_CountStackFrames
    // JVM_CurrentThread
    // JVM_CurrentTimeMillis
    // JVM_DefineClass
    // JVM_DefineClassWithSource
    // JVM_DefineModule
    // JVM_DesiredAssertionStatus
    // JVM_DoPrivileged
    // JVM_DumpAllStacks
    // JVM_DumpThreads
    // JVM_FillInStackTrace
    // JVM_FindClassFromBootLoader
    // JVM_FindClassFromCaller
    // JVM_FindClassFromClass
    // JVM_FindLibraryEntry
    // JVM_FindLoadedClass
    // JVM_FindPrimitiveClass
    // JVM_FindSignal
    // JVM_FreeMemory
    // JVM_GC
    // JVM_GetAllThreads
    // JVM_GetAndClearReferencePendingList
    // JVM_GetArrayElement
    // JVM_GetArrayLength
    // JVM_GetCallerClass
    // JVM_GetClassAccessFlags
    // JVM_GetClassAnnotations
    // JVM_GetClassConstantPool
    // JVM_GetClassContext
    // JVM_GetClassCPEntriesCount
    // JVM_GetClassCPTypes
    // JVM_GetClassDeclaredConstructors
    // JVM_GetClassDeclaredFields
    // JVM_GetClassDeclaredMethods
    // JVM_GetClassFieldsCount
    // JVM_GetClassInterfaces
    // JVM_GetClassMethodsCount
    // JVM_GetClassModifiers
    // JVM_GetClassNameUTF
    // JVM_GetClassSignature
    // JVM_GetClassSigners
    // JVM_GetClassTypeAnnotations
    // JVM_GetCPClassNameUTF
    // JVM_GetCPFieldClassNameUTF
    // JVM_GetCPFieldModifiers
    // JVM_GetCPFieldNameUTF
    // JVM_GetCPFieldSignatureUTF
    // JVM_GetCPMethodClassNameUTF
    // JVM_GetCPMethodModifiers
    // JVM_GetCPMethodNameUTF
    // JVM_GetCPMethodSignatureUTF
    // JVM_GetDeclaredClasses
    // JVM_GetDeclaringClass
    // JVM_GetEnclosingMethodInfo
    // JVM_GetFieldIxModifiers
    // JVM_GetFieldTypeAnnotations
    // JVM_GetInheritedAccessControlContext
    // JVM_GetInterfaceVersion
    // JVM_GetManagement
    // JVM_GetMethodIxArgsSize
    // JVM_GetMethodIxByteCode
    // JVM_GetMethodIxByteCodeLength
    // JVM_GetMethodIxExceptionIndexes
    // JVM_GetMethodIxExceptionsCount
    // JVM_GetMethodIxExceptionTableEntry
    // JVM_GetMethodIxExceptionTableLength
    // JVM_GetMethodIxLocalsCount
    // JVM_GetMethodIxMaxStack
    // JVM_GetMethodIxModifiers
    // JVM_GetMethodIxNameUTF
    // JVM_GetMethodIxSignatureUTF
    // JVM_GetMethodParameters
    // JVM_GetMethodTypeAnnotations
    // JVM_GetNanoTimeAdjustment
    // JVM_GetNestHost
    // JVM_GetNestMembers
    // JVM_GetPrimitiveArrayElement
    // JVM_GetProtectionDomain
    // JVM_GetSimpleBinaryName
    // JVM_GetStackAccessControlContext
    // JVM_GetSystemPackage
    // JVM_GetSystemPackages
    // JVM_GetTemporaryDirectory
    // JVM_GetVersionInfo
    // JVM_GetVmArguments
    // JVM_Halt
    // JVM_handle_linux_signal
    // JVM_HasReferencePendingList
    // JVM_HoldsLock
    // JVM_IHashCode
    // JVM_InitAgentProperties
    // JVM_InitClassName
    // JVM_InitProperties
    // JVM_InitStackTraceElement
    // JVM_InitStackTraceElementArray
    // JVM_InternString
    // JVM_Interrupt
    // JVM_InvokeMethod
    // JVM_IsArrayClass
    // JVM_IsConstructorIx
    // JVM_IsInterface
    // JVM_IsInterrupted
    // JVM_IsPrimitiveClass
    // JVM_IsSameClassPackage
    // JVM_IsSupportedJNIVersion
    // JVM_IsThreadAlive
    // JVM_IsVMGeneratedMethodIx
    // JVM_LatestUserDefinedLoader
    // JVM_LoadLibrary
    // JVM_MaxMemory
    // JVM_MaxObjectInspectionAge
    // JVM_MonitorNotify
    // JVM_MonitorNotifyAll
    // JVM_MonitorWait
    // JVM_MoreStackWalk
    // JVM_NanoTime
    // JVM_NativePath
    // JVM_NewArray
    // JVM_NewInstanceFromConstructor
    // JVM_NewMultiArray
    // JVM_RaiseSignal
    // JVM_RawMonitorCreate
    // JVM_RawMonitorDestroy
    // JVM_RawMonitorEnter
    // JVM_RawMonitorExit
    // JVM_RegisterSignal
    // JVM_ReleaseUTF
    // JVM_ResumeThread
    // JVM_SetArrayElement
    // JVM_SetBootLoaderUnnamedModule
    // JVM_SetClassSigners
    // JVM_SetNativeThreadName
    // JVM_SetPrimitiveArrayElement
    // JVM_SetThreadPriority
    // JVM_Sleep
    // JVM_StartThread
    // JVM_StopThread
    // JVM_SupportsCX8
    // JVM_SuspendThread
    // JVM_TotalMemory
    // JVM_UnloadLibrary
    // JVM_WaitForReferencePendingList
    // JVM_Yield
}
