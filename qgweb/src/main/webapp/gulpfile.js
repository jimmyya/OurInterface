var gulp = require('gulp');
var minifyCss = require('gulp-minify-css');
// var minifyHtml = require('gulp-minify-html');
// var uglify = require('gulp-uglify');

gulp.task('css', function (){
    return gulp.src('src/css/*.css')
        .pipe(minifyCss())
        .pipe(gulp.dest('dist/css'));
});

gulp.task('html', function (){
    return gulp.src('src/html/**/*.html')
 //       .pipe(minifyHtml())
        .pipe(gulp.dest('dist/html'));
});

gulp.task('script', function () {
   return gulp.src('src/js/*.js')
//    .pipe(uglify())
    .pipe(gulp.dest('dist/js'));
})

gulp.task('default', function(){
    gulp.run('css');
    gulp.run('html');
    gulp.run('script');
});