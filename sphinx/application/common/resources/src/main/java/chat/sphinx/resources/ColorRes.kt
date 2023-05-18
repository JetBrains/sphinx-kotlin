//added for an extra annotationtarget.TYPE missed in the original source
package chat.sphinx.resources

@Target(
//    AnnotationTarget.TYPE,
    AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION, AnnotationTarget.TYPE,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD,
    AnnotationTarget.LOCAL_VARIABLE
)
@Retention(AnnotationRetention.BINARY)

annotation class ColorRes()
