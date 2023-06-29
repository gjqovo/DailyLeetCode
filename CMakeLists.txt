cmake_minimum_required(VERSION 3.13)

project(DailyLeet
        VERSION 1.0
        LANGUAGES CXX)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED TRUE)
set(CMAKE_GENERATOR "MinGW Makefiles")

set(CMAKE_RUNTIME_OUTPUT_DIRECTORY ${PROJECT_BINARY_DIR}/output)

if(MSVC)
    add_compile_options("/W4" "/W14640" "/WX")
    add_compile_options("/Z7" "$<$<CONFIG:RELEASE>:/O2>")
else()
    add_compile_options("-Wall" "-Werror" "-Wextra")
    add_compile_options("-g" "$<$<CONFIG:RELEASE>:-O3>")
    add_compile_options("-fno-stack-protector")
    add_definitions(-D_FORTIFY_SOURCE=1)
endif()

add_subdirectory(src)

option(ENABLE_UNIT_TESTS "Enable Unit Tests" OFF)

message(STATUS "Enable Unit Tests ${ENABLE_UNIT_TESTS}")

if(ENABLE_UNIT_TESTS)
    enable_testing()
    add_subdirectory("tests")
endif()

