package com.helospark.spark.builder.handlers.codegenerator.domain;

import javax.annotation.Generated;

import org.eclipse.jdt.core.dom.Type;

/**
 * Domain object representing a field in the builder that is a parameter in the super() call.
 * @author helospark
 */
public class ConstructorParameterSetterBuilderField extends BuilderField {
    private Integer index;

    @Generated("SparkTools")
    private ConstructorParameterSetterBuilderField(Builder builder) {
        this.fieldType = builder.fieldType;
        this.originalFieldName = builder.originalFieldName;
        this.builderFieldName = builder.builderFieldName;
        this.index = builder.index;
    }

    public Integer getIndex() {
        return index;
    }

    @Generated("SparkTools")
    public static Builder builder() {
        return new Builder();
    }

    @Generated("SparkTools")
    public static final class Builder {
        private Type fieldType;
        private String originalFieldName;
        private String builderFieldName;
        private Integer index;

        private Builder() {
        }

        public Builder withFieldType(Type fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        public Builder withOriginalFieldName(String originalFieldName) {
            this.originalFieldName = originalFieldName;
            return this;
        }

        public Builder withBuilderFieldName(String builderFieldName) {
            this.builderFieldName = builderFieldName;
            return this;
        }

        public Builder withIndex(Integer index) {
            this.index = index;
            return this;
        }

        public ConstructorParameterSetterBuilderField build() {
            return new ConstructorParameterSetterBuilderField(this);
        }
    }

}
