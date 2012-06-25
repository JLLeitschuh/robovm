/*
 * Copyright (C) 2012 RoboVM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
#ifndef CLASSINFO_H
#define CLASSINFO_H

#include <robovm.h>

#define CI_FLAGS_BITS 10
#define CI_INTERFACE_COUNT_BITS 6
#define CI_INTERFACE_COUNT_MASK ((1 << CI_INTERFACE_COUNT_BITS) - 1)
#define CI_FIELD_COUNT_BITS 8
#define CI_FIELD_COUNT_MASK ((1 << CI_FIELD_COUNT_BITS) - 1)
#define CI_METHOD_COUNT_BITS 8
#define CI_METHOD_COUNT_MASK ((1 << CI_METHOD_COUNT_BITS) - 1)
#define CI_PUBLIC 0x1
#define CI_FINAL 0x2
#define CI_INTERFACE 0x4
#define CI_ABSTRACT 0x8
#define CI_SYNTHETIC 0x10
#define CI_ANNOTATION 0x20
#define CI_ENUM 0x40
#define CI_ATTRIBUTES 0x80
#define CI_ERROR 0x100
#define CI_INITIALIZED 0x200

#define CI_ERROR_TYPE_NONE 0x0
#define CI_ERROR_TYPE_NO_CLASS_DEF_FOUND 0x1
#define CI_ERROR_TYPE_ILLEGAL_ACCESS 0x2
#define CI_ERROR_TYPE_INCOMPATIBLE_CLASS_CHANGE 0x3

typedef struct {
    Class* clazz;
    jint flags;
    const char* className;
    void* initializer;
    jint classDataSize;
    jint instanceDataSize;
    jint instanceDataOffset;
} ClassInfoHeader;

typedef struct {
    Class* clazz;
    jint flags;
    const char* className;
    jint errorType;
    const char* errorMessage;
} ClassInfoError;

typedef struct {
    jboolean (*classCallback)(Env*, ClassInfoHeader*, const char*, const char*, jint, jint, jint, jint, void*, void*, void*);
    jboolean (*interfaceCallback)(Env*, ClassInfoHeader*, const char*, void*);
    jboolean (*fieldCallback)(Env*, ClassInfoHeader*, const char*, const char*, jint, jint, void*, void*);
    jboolean (*methodCallback)(Env*, ClassInfoHeader*, const char*, const char*, jint, jint, void*, void*, void**, void*, void*, void*);
} ParseClassInfoCallbacks;

void parseClassInfo(Env* env, ClassInfoHeader* header, ParseClassInfoCallbacks* callbacks, void* data);

#endif
