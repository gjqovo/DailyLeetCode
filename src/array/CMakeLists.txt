add_library(array)

target_sources(array
        PUBLIC array_main.cpp
        PUBLIC easyArr.cpp)
target_include_directories(array
        PUBLIC ${CMAKE_CURRENT_SOURCE_DIR})
target_compile_features(array INTERFACE cxx_std_11)
