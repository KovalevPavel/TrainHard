package me.kovp.core

import org.koin.core.qualifier.StringQualifier

fun named(name: Class<out Annotation>): StringQualifier {
    return StringQualifier(name.name)
}