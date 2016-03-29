package com.jmeter.protocol;

public final class MsgProtobuf {
    private MsgProtobuf() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }
    public interface NotificationRequestOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required int32 sequence = 1;
        boolean hasSequence();
        int getSequence();

        // required int32 version = 2;
        boolean hasVersion();
        int getVersion();

        // required string type = 3;
        boolean hasType();
        String getType();

        // optional string data = 4;
        boolean hasData();
        String getData();
    }
    public static final class NotificationRequest extends
            com.google.protobuf.GeneratedMessage
            implements NotificationRequestOrBuilder {
        // Use NotificationRequest.newBuilder() to construct.
        private NotificationRequest(Builder builder) {
            super(builder);
        }
        private NotificationRequest(boolean noInit) {}

        private static final NotificationRequest defaultInstance;
        public static NotificationRequest getDefaultInstance() {
            return defaultInstance;
        }

        public NotificationRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return MsgProtobuf.internal_static_NotificationRequest_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return MsgProtobuf.internal_static_NotificationRequest_fieldAccessorTable;
        }

        private int bitField0_;
        // required int32 sequence = 1;
        public static final int SEQUENCE_FIELD_NUMBER = 1;
        private int sequence_;
        public boolean hasSequence() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        public int getSequence() {
            return sequence_;
        }

        // required int32 version = 2;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int version_;
        public boolean hasVersion() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        public int getVersion() {
            return version_;
        }

        // required string type = 3;
        public static final int TYPE_FIELD_NUMBER = 3;
        private Object type_;
        public boolean hasType() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        public String getType() {
            Object ref = type_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    type_ = s;
                }
                return s;
            }
        }
        private com.google.protobuf.ByteString getTypeBytes() {
            Object ref = type_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                type_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional string data = 4;
        public static final int DATA_FIELD_NUMBER = 4;
        private Object data_;
        public boolean hasData() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        public String getData() {
            Object ref = data_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    data_ = s;
                }
                return s;
            }
        }
        private com.google.protobuf.ByteString getDataBytes() {
            Object ref = data_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                data_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            sequence_ = 0;
            version_ = 0;
            type_ = "";
            data_ = "";
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasSequence()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasVersion()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasType()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt32(1, sequence_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, version_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, getTypeBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, getDataBytes());
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, sequence_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, version_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, getTypeBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, getDataBytes());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static NotificationRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }
        public static NotificationRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }
        public static NotificationRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }
        public static NotificationRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }
        public static NotificationRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }
        public static NotificationRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }
        public static NotificationRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }
        public static NotificationRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }
        public static NotificationRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }
        public static NotificationRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(NotificationRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements NotificationRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return MsgProtobuf.internal_static_NotificationRequest_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return MsgProtobuf.internal_static_NotificationRequest_fieldAccessorTable;
            }

            // Construct using com.bjjajale.push.common.protocol.MsgProtobuf.NotificationRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                sequence_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                version_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                type_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                data_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return NotificationRequest.getDescriptor();
            }

            public NotificationRequest getDefaultInstanceForType() {
                return NotificationRequest.getDefaultInstance();
            }

            public NotificationRequest build() {
                NotificationRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private NotificationRequest buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                NotificationRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public NotificationRequest buildPartial() {
                NotificationRequest result = new NotificationRequest(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.sequence_ = sequence_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.version_ = version_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.type_ = type_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.data_ = data_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof NotificationRequest) {
                    return mergeFrom((NotificationRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(NotificationRequest other) {
                if (other == NotificationRequest.getDefaultInstance()) return this;
                if (other.hasSequence()) {
                    setSequence(other.getSequence());
                }
                if (other.hasVersion()) {
                    setVersion(other.getVersion());
                }
                if (other.hasType()) {
                    setType(other.getType());
                }
                if (other.hasData()) {
                    setData(other.getData());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasSequence()) {

                    return false;
                }
                if (!hasVersion()) {

                    return false;
                }
                if (!hasType()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder(
                                this.getUnknownFields());
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            this.setUnknownFields(unknownFields.build());
                            onChanged();
                            return this;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                this.setUnknownFields(unknownFields.build());
                                onChanged();
                                return this;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            sequence_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            version_ = input.readInt32();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            type_ = input.readBytes();
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            data_ = input.readBytes();
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // required int32 sequence = 1;
            private int sequence_ ;
            public boolean hasSequence() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            public int getSequence() {
                return sequence_;
            }
            public Builder setSequence(int value) {
                bitField0_ |= 0x00000001;
                sequence_ = value;
                onChanged();
                return this;
            }
            public Builder clearSequence() {
                bitField0_ = (bitField0_ & ~0x00000001);
                sequence_ = 0;
                onChanged();
                return this;
            }

            // required int32 version = 2;
            private int version_ ;
            public boolean hasVersion() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            public int getVersion() {
                return version_;
            }
            public Builder setVersion(int value) {
                bitField0_ |= 0x00000002;
                version_ = value;
                onChanged();
                return this;
            }
            public Builder clearVersion() {
                bitField0_ = (bitField0_ & ~0x00000002);
                version_ = 0;
                onChanged();
                return this;
            }

            // required string type = 3;
            private Object type_ = "";
            public boolean hasType() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            public String getType() {
                Object ref = type_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    type_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            public Builder setType(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                type_ = value;
                onChanged();
                return this;
            }
            public Builder clearType() {
                bitField0_ = (bitField0_ & ~0x00000004);
                type_ = getDefaultInstance().getType();
                onChanged();
                return this;
            }
            void setType(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000004;
                type_ = value;
                onChanged();
            }

            // optional string data = 4;
            private Object data_ = "";
            public boolean hasData() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            public String getData() {
                Object ref = data_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    data_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            public Builder setData(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                data_ = value;
                onChanged();
                return this;
            }
            public Builder clearData() {
                bitField0_ = (bitField0_ & ~0x00000008);
                data_ = getDefaultInstance().getData();
                onChanged();
                return this;
            }
            void setData(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000008;
                data_ = value;
                onChanged();
            }

            // @@protoc_insertion_point(builder_scope:NotificationRequest)
        }

        static {
            defaultInstance = new NotificationRequest(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:NotificationRequest)
    }

    public interface NotificationResponseOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required int32 sequence = 1;
        boolean hasSequence();
        int getSequence();

        // required int32 version = 2;
        boolean hasVersion();
        int getVersion();

        // required int32 status = 3;
        boolean hasStatus();
        int getStatus();

        // optional string data = 4;
        boolean hasData();
        String getData();
    }
    public static final class NotificationResponse extends
            com.google.protobuf.GeneratedMessage
            implements NotificationResponseOrBuilder {
        // Use NotificationResponse.newBuilder() to construct.
        private NotificationResponse(Builder builder) {
            super(builder);
        }
        private NotificationResponse(boolean noInit) {}

        private static final NotificationResponse defaultInstance;
        public static NotificationResponse getDefaultInstance() {
            return defaultInstance;
        }

        public NotificationResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return MsgProtobuf.internal_static_NotificationResponse_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return MsgProtobuf.internal_static_NotificationResponse_fieldAccessorTable;
        }

        private int bitField0_;
        // required int32 sequence = 1;
        public static final int SEQUENCE_FIELD_NUMBER = 1;
        private int sequence_;
        public boolean hasSequence() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        public int getSequence() {
            return sequence_;
        }

        // required int32 version = 2;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int version_;
        public boolean hasVersion() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        public int getVersion() {
            return version_;
        }

        // required int32 status = 3;
        public static final int STATUS_FIELD_NUMBER = 3;
        private int status_;
        public boolean hasStatus() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        public int getStatus() {
            return status_;
        }

        // optional string data = 4;
        public static final int DATA_FIELD_NUMBER = 4;
        private Object data_;
        public boolean hasData() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        public String getData() {
            Object ref = data_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    data_ = s;
                }
                return s;
            }
        }
        private com.google.protobuf.ByteString getDataBytes() {
            Object ref = data_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                data_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            sequence_ = 0;
            version_ = 0;
            status_ = 0;
            data_ = "";
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasSequence()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasVersion()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasStatus()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt32(1, sequence_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, version_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeInt32(3, status_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, getDataBytes());
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, sequence_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, version_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, status_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, getDataBytes());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static NotificationResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }
        public static NotificationResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }
        public static NotificationResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }
        public static NotificationResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }
        public static NotificationResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }
        public static NotificationResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }
        public static NotificationResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }
        public static NotificationResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }
        public static NotificationResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }
        public static NotificationResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(NotificationResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements NotificationResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return MsgProtobuf.internal_static_NotificationResponse_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return MsgProtobuf.internal_static_NotificationResponse_fieldAccessorTable;
            }

            // Construct using com.bjjajale.push.common.protocol.MsgProtobuf.NotificationResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                sequence_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                version_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                status_ = 0;
                bitField0_ = (bitField0_ & ~0x00000004);
                data_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return NotificationResponse.getDescriptor();
            }

            public NotificationResponse getDefaultInstanceForType() {
                return NotificationResponse.getDefaultInstance();
            }

            public NotificationResponse build() {
                NotificationResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private NotificationResponse buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                NotificationResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public NotificationResponse buildPartial() {
                NotificationResponse result = new NotificationResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.sequence_ = sequence_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.version_ = version_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.status_ = status_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.data_ = data_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof NotificationResponse) {
                    return mergeFrom((NotificationResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(NotificationResponse other) {
                if (other == NotificationResponse.getDefaultInstance()) return this;
                if (other.hasSequence()) {
                    setSequence(other.getSequence());
                }
                if (other.hasVersion()) {
                    setVersion(other.getVersion());
                }
                if (other.hasStatus()) {
                    setStatus(other.getStatus());
                }
                if (other.hasData()) {
                    setData(other.getData());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasSequence()) {

                    return false;
                }
                if (!hasVersion()) {

                    return false;
                }
                if (!hasStatus()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder(
                                this.getUnknownFields());
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            this.setUnknownFields(unknownFields.build());
                            onChanged();
                            return this;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                this.setUnknownFields(unknownFields.build());
                                onChanged();
                                return this;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            sequence_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            version_ = input.readInt32();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            status_ = input.readInt32();
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            data_ = input.readBytes();
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // required int32 sequence = 1;
            private int sequence_ ;
            public boolean hasSequence() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            public int getSequence() {
                return sequence_;
            }
            public Builder setSequence(int value) {
                bitField0_ |= 0x00000001;
                sequence_ = value;
                onChanged();
                return this;
            }
            public Builder clearSequence() {
                bitField0_ = (bitField0_ & ~0x00000001);
                sequence_ = 0;
                onChanged();
                return this;
            }

            // required int32 version = 2;
            private int version_ ;
            public boolean hasVersion() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            public int getVersion() {
                return version_;
            }
            public Builder setVersion(int value) {
                bitField0_ |= 0x00000002;
                version_ = value;
                onChanged();
                return this;
            }
            public Builder clearVersion() {
                bitField0_ = (bitField0_ & ~0x00000002);
                version_ = 0;
                onChanged();
                return this;
            }

            // required int32 status = 3;
            private int status_ ;
            public boolean hasStatus() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            public int getStatus() {
                return status_;
            }
            public Builder setStatus(int value) {
                bitField0_ |= 0x00000004;
                status_ = value;
                onChanged();
                return this;
            }
            public Builder clearStatus() {
                bitField0_ = (bitField0_ & ~0x00000004);
                status_ = 0;
                onChanged();
                return this;
            }

            // optional string data = 4;
            private Object data_ = "";
            public boolean hasData() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            public String getData() {
                Object ref = data_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    data_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            public Builder setData(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                data_ = value;
                onChanged();
                return this;
            }
            public Builder clearData() {
                bitField0_ = (bitField0_ & ~0x00000008);
                data_ = getDefaultInstance().getData();
                onChanged();
                return this;
            }
            void setData(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000008;
                data_ = value;
                onChanged();
            }

            // @@protoc_insertion_point(builder_scope:NotificationResponse)
        }

        static {
            defaultInstance = new NotificationResponse(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:NotificationResponse)
    }

    public interface LoginRequestOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required int32 sequence = 1;
        boolean hasSequence();
        int getSequence();

        // required int32 version = 2;
        boolean hasVersion();
        int getVersion();

        // required string userId = 3;
        boolean hasUserId();
        String getUserId();

        // optional string imei = 4;
        boolean hasImei();
        String getImei();

        // required string passwd = 5;
        boolean hasPasswd();
        String getPasswd();
    }
    public static final class LoginRequest extends
            com.google.protobuf.GeneratedMessage
            implements LoginRequestOrBuilder {
        // Use LoginRequest.newBuilder() to construct.
        private LoginRequest(Builder builder) {
            super(builder);
        }
        private LoginRequest(boolean noInit) {}

        private static final LoginRequest defaultInstance;
        public static LoginRequest getDefaultInstance() {
            return defaultInstance;
        }

        public LoginRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return MsgProtobuf.internal_static_LoginRequest_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return MsgProtobuf.internal_static_LoginRequest_fieldAccessorTable;
        }

        private int bitField0_;
        // required int32 sequence = 1;
        public static final int SEQUENCE_FIELD_NUMBER = 1;
        private int sequence_;
        public boolean hasSequence() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        public int getSequence() {
            return sequence_;
        }

        // required int32 version = 2;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int version_;
        public boolean hasVersion() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        public int getVersion() {
            return version_;
        }

        // required string userId = 3;
        public static final int USERID_FIELD_NUMBER = 3;
        private Object userId_;
        public boolean hasUserId() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        public String getUserId() {
            Object ref = userId_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    userId_ = s;
                }
                return s;
            }
        }
        private com.google.protobuf.ByteString getUserIdBytes() {
            Object ref = userId_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                userId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional string imei = 4;
        public static final int IMEI_FIELD_NUMBER = 4;
        private Object imei_;
        public boolean hasImei() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        public String getImei() {
            Object ref = imei_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    imei_ = s;
                }
                return s;
            }
        }
        private com.google.protobuf.ByteString getImeiBytes() {
            Object ref = imei_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                imei_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // required string passwd = 5;
        public static final int PASSWD_FIELD_NUMBER = 5;
        private Object passwd_;
        public boolean hasPasswd() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        public String getPasswd() {
            Object ref = passwd_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    passwd_ = s;
                }
                return s;
            }
        }
        private com.google.protobuf.ByteString getPasswdBytes() {
            Object ref = passwd_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                passwd_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            sequence_ = 0;
            version_ = 0;
            userId_ = "";
            imei_ = "";
            passwd_ = "";
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasSequence()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasVersion()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasUserId()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasPasswd()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt32(1, sequence_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, version_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, getUserIdBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, getImeiBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeBytes(5, getPasswdBytes());
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, sequence_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, version_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, getUserIdBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, getImeiBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(5, getPasswdBytes());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static LoginRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }
        public static LoginRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }
        public static LoginRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }
        public static LoginRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }
        public static LoginRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }
        public static LoginRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }
        public static LoginRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }
        public static LoginRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }
        public static LoginRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }
        public static LoginRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(LoginRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements LoginRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return MsgProtobuf.internal_static_LoginRequest_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return MsgProtobuf.internal_static_LoginRequest_fieldAccessorTable;
            }

            // Construct using com.bjjajale.push.common.protocol.MsgProtobuf.LoginRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                sequence_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                version_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                userId_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                imei_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                passwd_ = "";
                bitField0_ = (bitField0_ & ~0x00000010);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return LoginRequest.getDescriptor();
            }

            public LoginRequest getDefaultInstanceForType() {
                return LoginRequest.getDefaultInstance();
            }

            public LoginRequest build() {
                LoginRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private LoginRequest buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                LoginRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public LoginRequest buildPartial() {
                LoginRequest result = new LoginRequest(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.sequence_ = sequence_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.version_ = version_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.userId_ = userId_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.imei_ = imei_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.passwd_ = passwd_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof LoginRequest) {
                    return mergeFrom((LoginRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(LoginRequest other) {
                if (other == LoginRequest.getDefaultInstance()) return this;
                if (other.hasSequence()) {
                    setSequence(other.getSequence());
                }
                if (other.hasVersion()) {
                    setVersion(other.getVersion());
                }
                if (other.hasUserId()) {
                    setUserId(other.getUserId());
                }
                if (other.hasImei()) {
                    setImei(other.getImei());
                }
                if (other.hasPasswd()) {
                    setPasswd(other.getPasswd());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasSequence()) {

                    return false;
                }
                if (!hasVersion()) {

                    return false;
                }
                if (!hasUserId()) {

                    return false;
                }
                if (!hasPasswd()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder(
                                this.getUnknownFields());
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            this.setUnknownFields(unknownFields.build());
                            onChanged();
                            return this;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                this.setUnknownFields(unknownFields.build());
                                onChanged();
                                return this;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            sequence_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            version_ = input.readInt32();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            userId_ = input.readBytes();
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            imei_ = input.readBytes();
                            break;
                        }
                        case 42: {
                            bitField0_ |= 0x00000010;
                            passwd_ = input.readBytes();
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // required int32 sequence = 1;
            private int sequence_ ;
            public boolean hasSequence() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            public int getSequence() {
                return sequence_;
            }
            public Builder setSequence(int value) {
                bitField0_ |= 0x00000001;
                sequence_ = value;
                onChanged();
                return this;
            }
            public Builder clearSequence() {
                bitField0_ = (bitField0_ & ~0x00000001);
                sequence_ = 0;
                onChanged();
                return this;
            }

            // required int32 version = 2;
            private int version_ ;
            public boolean hasVersion() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            public int getVersion() {
                return version_;
            }
            public Builder setVersion(int value) {
                bitField0_ |= 0x00000002;
                version_ = value;
                onChanged();
                return this;
            }
            public Builder clearVersion() {
                bitField0_ = (bitField0_ & ~0x00000002);
                version_ = 0;
                onChanged();
                return this;
            }

            // required string userId = 3;
            private Object userId_ = "";
            public boolean hasUserId() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            public String getUserId() {
                Object ref = userId_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    userId_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            public Builder setUserId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                userId_ = value;
                onChanged();
                return this;
            }
            public Builder clearUserId() {
                bitField0_ = (bitField0_ & ~0x00000004);
                userId_ = getDefaultInstance().getUserId();
                onChanged();
                return this;
            }
            void setUserId(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000004;
                userId_ = value;
                onChanged();
            }

            // optional string imei = 4;
            private Object imei_ = "";
            public boolean hasImei() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            public String getImei() {
                Object ref = imei_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    imei_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            public Builder setImei(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                imei_ = value;
                onChanged();
                return this;
            }
            public Builder clearImei() {
                bitField0_ = (bitField0_ & ~0x00000008);
                imei_ = getDefaultInstance().getImei();
                onChanged();
                return this;
            }
            void setImei(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000008;
                imei_ = value;
                onChanged();
            }

            // required string passwd = 5;
            private Object passwd_ = "";
            public boolean hasPasswd() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            public String getPasswd() {
                Object ref = passwd_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    passwd_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            public Builder setPasswd(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                passwd_ = value;
                onChanged();
                return this;
            }
            public Builder clearPasswd() {
                bitField0_ = (bitField0_ & ~0x00000010);
                passwd_ = getDefaultInstance().getPasswd();
                onChanged();
                return this;
            }
            void setPasswd(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000010;
                passwd_ = value;
                onChanged();
            }

            // @@protoc_insertion_point(builder_scope:LoginRequest)
        }

        static {
            defaultInstance = new LoginRequest(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:LoginRequest)
    }

    public interface LoginResponseOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required int32 sequence = 1;
        boolean hasSequence();
        int getSequence();

        // required int32 version = 2;
        boolean hasVersion();
        int getVersion();

        // required int32 status = 3;
        boolean hasStatus();
        int getStatus();

        // optional string data = 4;
        boolean hasData();
        String getData();
    }
    public static final class LoginResponse extends
            com.google.protobuf.GeneratedMessage
            implements LoginResponseOrBuilder {
        // Use LoginResponse.newBuilder() to construct.
        private LoginResponse(Builder builder) {
            super(builder);
        }
        private LoginResponse(boolean noInit) {}

        private static final LoginResponse defaultInstance;
        public static LoginResponse getDefaultInstance() {
            return defaultInstance;
        }

        public LoginResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return MsgProtobuf.internal_static_LoginResponse_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return MsgProtobuf.internal_static_LoginResponse_fieldAccessorTable;
        }

        private int bitField0_;
        // required int32 sequence = 1;
        public static final int SEQUENCE_FIELD_NUMBER = 1;
        private int sequence_;
        public boolean hasSequence() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        public int getSequence() {
            return sequence_;
        }

        // required int32 version = 2;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int version_;
        public boolean hasVersion() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        public int getVersion() {
            return version_;
        }

        // required int32 status = 3;
        public static final int STATUS_FIELD_NUMBER = 3;
        private int status_;
        public boolean hasStatus() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        public int getStatus() {
            return status_;
        }

        // optional string data = 4;
        public static final int DATA_FIELD_NUMBER = 4;
        private Object data_;
        public boolean hasData() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        public String getData() {
            Object ref = data_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    data_ = s;
                }
                return s;
            }
        }
        private com.google.protobuf.ByteString getDataBytes() {
            Object ref = data_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                data_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            sequence_ = 0;
            version_ = 0;
            status_ = 0;
            data_ = "";
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasSequence()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasVersion()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasStatus()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt32(1, sequence_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, version_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeInt32(3, status_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, getDataBytes());
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, sequence_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, version_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, status_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, getDataBytes());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static LoginResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }
        public static LoginResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }
        public static LoginResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }
        public static LoginResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }
        public static LoginResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }
        public static LoginResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }
        public static LoginResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }
        public static LoginResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }
        public static LoginResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }
        public static LoginResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(LoginResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements LoginResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return MsgProtobuf.internal_static_LoginResponse_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return MsgProtobuf.internal_static_LoginResponse_fieldAccessorTable;
            }

            // Construct using com.bjjajale.push.common.protocol.MsgProtobuf.LoginResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                sequence_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                version_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                status_ = 0;
                bitField0_ = (bitField0_ & ~0x00000004);
                data_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return LoginResponse.getDescriptor();
            }

            public LoginResponse getDefaultInstanceForType() {
                return LoginResponse.getDefaultInstance();
            }

            public LoginResponse build() {
                LoginResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private LoginResponse buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                LoginResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public LoginResponse buildPartial() {
                LoginResponse result = new LoginResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.sequence_ = sequence_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.version_ = version_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.status_ = status_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.data_ = data_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof LoginResponse) {
                    return mergeFrom((LoginResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(LoginResponse other) {
                if (other == LoginResponse.getDefaultInstance()) return this;
                if (other.hasSequence()) {
                    setSequence(other.getSequence());
                }
                if (other.hasVersion()) {
                    setVersion(other.getVersion());
                }
                if (other.hasStatus()) {
                    setStatus(other.getStatus());
                }
                if (other.hasData()) {
                    setData(other.getData());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasSequence()) {

                    return false;
                }
                if (!hasVersion()) {

                    return false;
                }
                if (!hasStatus()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder(
                                this.getUnknownFields());
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            this.setUnknownFields(unknownFields.build());
                            onChanged();
                            return this;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                this.setUnknownFields(unknownFields.build());
                                onChanged();
                                return this;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            sequence_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            version_ = input.readInt32();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            status_ = input.readInt32();
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            data_ = input.readBytes();
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // required int32 sequence = 1;
            private int sequence_ ;
            public boolean hasSequence() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            public int getSequence() {
                return sequence_;
            }
            public Builder setSequence(int value) {
                bitField0_ |= 0x00000001;
                sequence_ = value;
                onChanged();
                return this;
            }
            public Builder clearSequence() {
                bitField0_ = (bitField0_ & ~0x00000001);
                sequence_ = 0;
                onChanged();
                return this;
            }

            // required int32 version = 2;
            private int version_ ;
            public boolean hasVersion() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            public int getVersion() {
                return version_;
            }
            public Builder setVersion(int value) {
                bitField0_ |= 0x00000002;
                version_ = value;
                onChanged();
                return this;
            }
            public Builder clearVersion() {
                bitField0_ = (bitField0_ & ~0x00000002);
                version_ = 0;
                onChanged();
                return this;
            }

            // required int32 status = 3;
            private int status_ ;
            public boolean hasStatus() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            public int getStatus() {
                return status_;
            }
            public Builder setStatus(int value) {
                bitField0_ |= 0x00000004;
                status_ = value;
                onChanged();
                return this;
            }
            public Builder clearStatus() {
                bitField0_ = (bitField0_ & ~0x00000004);
                status_ = 0;
                onChanged();
                return this;
            }

            // optional string data = 4;
            private Object data_ = "";
            public boolean hasData() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            public String getData() {
                Object ref = data_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    data_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            public Builder setData(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                data_ = value;
                onChanged();
                return this;
            }
            public Builder clearData() {
                bitField0_ = (bitField0_ & ~0x00000008);
                data_ = getDefaultInstance().getData();
                onChanged();
                return this;
            }
            void setData(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000008;
                data_ = value;
                onChanged();
            }

            // @@protoc_insertion_point(builder_scope:LoginResponse)
        }

        static {
            defaultInstance = new LoginResponse(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:LoginResponse)
    }

    public interface LinkRequestOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
    }
    public static final class LinkRequest extends
            com.google.protobuf.GeneratedMessage
            implements LinkRequestOrBuilder {
        // Use LinkRequest.newBuilder() to construct.
        private LinkRequest(Builder builder) {
            super(builder);
        }
        private LinkRequest(boolean noInit) {}

        private static final LinkRequest defaultInstance;
        public static LinkRequest getDefaultInstance() {
            return defaultInstance;
        }

        public LinkRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return MsgProtobuf.internal_static_LinkRequest_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return MsgProtobuf.internal_static_LinkRequest_fieldAccessorTable;
        }

        private void initFields() {
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static LinkRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }
        public static LinkRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }
        public static LinkRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }
        public static LinkRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }
        public static LinkRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }
        public static LinkRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }
        public static LinkRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }
        public static LinkRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }
        public static LinkRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }
        public static LinkRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(LinkRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements LinkRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return MsgProtobuf.internal_static_LinkRequest_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return MsgProtobuf.internal_static_LinkRequest_fieldAccessorTable;
            }

            // Construct using com.bjjajale.push.common.protocol.MsgProtobuf.LinkRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return LinkRequest.getDescriptor();
            }

            public LinkRequest getDefaultInstanceForType() {
                return LinkRequest.getDefaultInstance();
            }

            public LinkRequest build() {
                LinkRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private LinkRequest buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                LinkRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public LinkRequest buildPartial() {
                LinkRequest result = new LinkRequest(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof LinkRequest) {
                    return mergeFrom((LinkRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(LinkRequest other) {
                if (other == LinkRequest.getDefaultInstance()) return this;
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder(
                                this.getUnknownFields());
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            this.setUnknownFields(unknownFields.build());
                            onChanged();
                            return this;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                this.setUnknownFields(unknownFields.build());
                                onChanged();
                                return this;
                            }
                            break;
                        }
                    }
                }
            }


            // @@protoc_insertion_point(builder_scope:LinkRequest)
        }

        static {
            defaultInstance = new LinkRequest(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:LinkRequest)
    }

    public interface LinkResponseOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
    }
    public static final class LinkResponse extends
            com.google.protobuf.GeneratedMessage
            implements LinkResponseOrBuilder {
        // Use LinkResponse.newBuilder() to construct.
        private LinkResponse(Builder builder) {
            super(builder);
        }
        private LinkResponse(boolean noInit) {}

        private static final LinkResponse defaultInstance;
        public static LinkResponse getDefaultInstance() {
            return defaultInstance;
        }

        public LinkResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return MsgProtobuf.internal_static_LinkResponse_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return MsgProtobuf.internal_static_LinkResponse_fieldAccessorTable;
        }

        private void initFields() {
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static LinkResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }
        public static LinkResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }
        public static LinkResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }
        public static LinkResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }
        public static LinkResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }
        public static LinkResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }
        public static LinkResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }
        public static LinkResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }
        public static LinkResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }
        public static LinkResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(LinkResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements LinkResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return MsgProtobuf.internal_static_LinkResponse_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return MsgProtobuf.internal_static_LinkResponse_fieldAccessorTable;
            }

            // Construct using com.bjjajale.push.common.protocol.MsgProtobuf.LinkResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return LinkResponse.getDescriptor();
            }

            public LinkResponse getDefaultInstanceForType() {
                return LinkResponse.getDefaultInstance();
            }

            public LinkResponse build() {
                LinkResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private LinkResponse buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                LinkResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public LinkResponse buildPartial() {
                LinkResponse result = new LinkResponse(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof LinkResponse) {
                    return mergeFrom((LinkResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(LinkResponse other) {
                if (other == LinkResponse.getDefaultInstance()) return this;
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder(
                                this.getUnknownFields());
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            this.setUnknownFields(unknownFields.build());
                            onChanged();
                            return this;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                this.setUnknownFields(unknownFields.build());
                                onChanged();
                                return this;
                            }
                            break;
                        }
                    }
                }
            }


            // @@protoc_insertion_point(builder_scope:LinkResponse)
        }

        static {
            defaultInstance = new LinkResponse(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:LinkResponse)
    }

    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_NotificationRequest_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_NotificationRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_NotificationResponse_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_NotificationResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_LoginRequest_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_LoginRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_LoginResponse_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_LoginResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_LinkRequest_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_LinkRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_LinkResponse_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_LinkResponse_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        String[] descriptorData = {
                "\n\021NewMsgProto.proto\"T\n\023NotificationReque" +
                        "st\022\020\n\010sequence\030\001 \002(\005\022\017\n\007version\030\002 \002(\005\022\014\n" +
                        "\004type\030\003 \002(\t\022\014\n\004data\030\004 \001(\t\"W\n\024Notificatio" +
                        "nResponse\022\020\n\010sequence\030\001 \002(\005\022\017\n\007version\030\002" +
                        " \002(\005\022\016\n\006status\030\003 \002(\005\022\014\n\004data\030\004 \001(\t\"_\n\014Lo" +
                        "ginRequest\022\020\n\010sequence\030\001 \002(\005\022\017\n\007version\030" +
                        "\002 \002(\005\022\016\n\006userId\030\003 \002(\t\022\014\n\004imei\030\004 \001(\t\022\016\n\006p" +
                        "asswd\030\005 \002(\t\"P\n\rLoginResponse\022\020\n\010sequence" +
                        "\030\001 \002(\005\022\017\n\007version\030\002 \002(\005\022\016\n\006status\030\003 \002(\005\022" +
                        "\014\n\004data\030\004 \001(\t\"\r\n\013LinkRequest\"\016\n\014LinkResp",
                "onseB0\n!com.bjjajale.push.common.protoco" +
                        "lB\013MsgProtobuf"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        internal_static_NotificationRequest_descriptor =
                                getDescriptor().getMessageTypes().get(0);
                        internal_static_NotificationRequest_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_NotificationRequest_descriptor,
                                new String[] { "Sequence", "Version", "Type", "Data", },
                                NotificationRequest.class,
                                NotificationRequest.Builder.class);
                        internal_static_NotificationResponse_descriptor =
                                getDescriptor().getMessageTypes().get(1);
                        internal_static_NotificationResponse_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_NotificationResponse_descriptor,
                                new String[] { "Sequence", "Version", "Status", "Data", },
                                NotificationResponse.class,
                                NotificationResponse.Builder.class);
                        internal_static_LoginRequest_descriptor =
                                getDescriptor().getMessageTypes().get(2);
                        internal_static_LoginRequest_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_LoginRequest_descriptor,
                                new String[] { "Sequence", "Version", "UserId", "Imei", "Passwd", },
                                LoginRequest.class,
                                LoginRequest.Builder.class);
                        internal_static_LoginResponse_descriptor =
                                getDescriptor().getMessageTypes().get(3);
                        internal_static_LoginResponse_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_LoginResponse_descriptor,
                                new String[] { "Sequence", "Version", "Status", "Data", },
                                LoginResponse.class,
                                LoginResponse.Builder.class);
                        internal_static_LinkRequest_descriptor =
                                getDescriptor().getMessageTypes().get(4);
                        internal_static_LinkRequest_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_LinkRequest_descriptor,
                                new String[] { },
                                LinkRequest.class,
                                LinkRequest.Builder.class);
                        internal_static_LinkResponse_descriptor =
                                getDescriptor().getMessageTypes().get(5);
                        internal_static_LinkResponse_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_LinkResponse_descriptor,
                                new String[] { },
                                LinkResponse.class,
                                LinkResponse.Builder.class);
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        }, assigner);
    }

    // @@protoc_insertion_point(outer_class_scope)
}
