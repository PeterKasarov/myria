# Generated by the protocol buffer compiler.  DO NOT EDIT!

from google.protobuf import descriptor
from google.protobuf import message
from google.protobuf import reflection
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)



DESCRIPTOR = descriptor.FileDescriptor(
  name='query.proto',
  package='',
  serialized_pb='\n\x0bquery.proto\"\x90\x02\n\x0cQueryMessage\x12\x10\n\x08query_id\x18\x01 \x02(\x04\x12 \n\x04type\x18\x02 \x02(\x0e\x32\x12.QueryMessage.Type\x12\"\n\x0cquery_report\x18\x03 \x01(\x0b\x32\x0c.QueryReport\x12\x15\n\x05query\x18\x04 \x01(\x0b\x32\x06.Query\"\x90\x01\n\x04Type\x12\x14\n\x10QUERY_DISTRIBUTE\x10\x00\x12\x0f\n\x0bQUERY_START\x10\x01\x12\x0f\n\x0bQUERY_PAUSE\x10\x07\x12\x10\n\x0cQUERY_RESUME\x10\x08\x12\x0e\n\nQUERY_KILL\x10\t\x12\x1a\n\x16QUERY_READY_TO_EXECUTE\x10\x02\x12\x12\n\x0eQUERY_COMPLETE\x10\x06\"\x16\n\x05Query\x12\r\n\x05query\x18\x01 \x02(\x0c\"=\n\x0bQueryReport\x12\x0f\n\x07success\x18\x01 \x02(\x08\x12\x0e\n\x06\x65lapse\x18\x02 \x02(\x04\x12\r\n\x05\x63\x61use\x18\x03 \x01(\x0c\x42\x32\n$edu.washington.escience.myriad.protoB\nQueryProto')



_QUERYMESSAGE_TYPE = descriptor.EnumDescriptor(
  name='Type',
  full_name='QueryMessage.Type',
  filename=None,
  file=DESCRIPTOR,
  values=[
    descriptor.EnumValueDescriptor(
      name='QUERY_DISTRIBUTE', index=0, number=0,
      options=None,
      type=None),
    descriptor.EnumValueDescriptor(
      name='QUERY_START', index=1, number=1,
      options=None,
      type=None),
    descriptor.EnumValueDescriptor(
      name='QUERY_PAUSE', index=2, number=7,
      options=None,
      type=None),
    descriptor.EnumValueDescriptor(
      name='QUERY_RESUME', index=3, number=8,
      options=None,
      type=None),
    descriptor.EnumValueDescriptor(
      name='QUERY_KILL', index=4, number=9,
      options=None,
      type=None),
    descriptor.EnumValueDescriptor(
      name='QUERY_READY_TO_EXECUTE', index=5, number=2,
      options=None,
      type=None),
    descriptor.EnumValueDescriptor(
      name='QUERY_COMPLETE', index=6, number=6,
      options=None,
      type=None),
  ],
  containing_type=None,
  options=None,
  serialized_start=144,
  serialized_end=288,
)


_QUERYMESSAGE = descriptor.Descriptor(
  name='QueryMessage',
  full_name='QueryMessage',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    descriptor.FieldDescriptor(
      name='query_id', full_name='QueryMessage.query_id', index=0,
      number=1, type=4, cpp_type=4, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    descriptor.FieldDescriptor(
      name='type', full_name='QueryMessage.type', index=1,
      number=2, type=14, cpp_type=8, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    descriptor.FieldDescriptor(
      name='query_report', full_name='QueryMessage.query_report', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    descriptor.FieldDescriptor(
      name='query', full_name='QueryMessage.query', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _QUERYMESSAGE_TYPE,
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=16,
  serialized_end=288,
)


_QUERY = descriptor.Descriptor(
  name='Query',
  full_name='Query',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    descriptor.FieldDescriptor(
      name='query', full_name='Query.query', index=0,
      number=1, type=12, cpp_type=9, label=2,
      has_default_value=False, default_value="",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=290,
  serialized_end=312,
)


_QUERYREPORT = descriptor.Descriptor(
  name='QueryReport',
  full_name='QueryReport',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    descriptor.FieldDescriptor(
      name='success', full_name='QueryReport.success', index=0,
      number=1, type=8, cpp_type=7, label=2,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    descriptor.FieldDescriptor(
      name='elapse', full_name='QueryReport.elapse', index=1,
      number=2, type=4, cpp_type=4, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    descriptor.FieldDescriptor(
      name='cause', full_name='QueryReport.cause', index=2,
      number=3, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value="",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=314,
  serialized_end=375,
)

_QUERYMESSAGE.fields_by_name['type'].enum_type = _QUERYMESSAGE_TYPE
_QUERYMESSAGE.fields_by_name['query_report'].message_type = _QUERYREPORT
_QUERYMESSAGE.fields_by_name['query'].message_type = _QUERY
_QUERYMESSAGE_TYPE.containing_type = _QUERYMESSAGE;
DESCRIPTOR.message_types_by_name['QueryMessage'] = _QUERYMESSAGE
DESCRIPTOR.message_types_by_name['Query'] = _QUERY
DESCRIPTOR.message_types_by_name['QueryReport'] = _QUERYREPORT

class QueryMessage(message.Message):
  __metaclass__ = reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _QUERYMESSAGE
  
  # @@protoc_insertion_point(class_scope:QueryMessage)

class Query(message.Message):
  __metaclass__ = reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _QUERY
  
  # @@protoc_insertion_point(class_scope:Query)

class QueryReport(message.Message):
  __metaclass__ = reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _QUERYREPORT
  
  # @@protoc_insertion_point(class_scope:QueryReport)

# @@protoc_insertion_point(module_scope)
