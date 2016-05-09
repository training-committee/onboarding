module.exports = function(grunt) {

  grunt.initConfig({

    pkg: grunt.file.readJSON('package.json'),
      // Copy web assets from bower_components to more convenient directories.
    copy: {
        main: {
            files: [
                // Vendor scripts.
                {
                    expand: true,
                    cwd: 'bower_components/bootstrap-sass/assets/javascripts/',
                    src: ['**/*.js'],
                    dest: '/static/js/vendor/bootstrap/'
                },
                {
                    expand: true,
                    cwd: 'bower_components/jquery/dist/',
                    src: ['**/*.js', '**/*.map'],
                    dest: 'static/js/vendor/jquery/'
                },
                // Fonts.
                {
                    expand: true,
                    filter: 'isFile',
                    flatten: true,
                    cwd: 'bower_components/',
                    src: ['bootstrap-sass/assets/fonts/**'],
                    dest: 'static/fonts/'
                },
                // Stylesheets
                {
                  expand: true,
                  cwd: 'bower_components/bootstrap-sass/assets/stylesheets/',
                  src: ['**/*.scss'],
                  dest: 'scss/'
                }
            ]
        },
    },

    // Compile SASS files into minified CSS.
    sass: {
        options: {
            includePaths: ['bower_components/bootstrap-sass/assets/stylesheets']
        },
        dist: {
            options: {
                outputStyle: 'expanded'

            },
            files: {
                'static/css/styles.css': 'scss/styles.scss'
            }
        }
    },

    // Watch these files and notify of changes.
    watch: {
        grunt: { files: ['Gruntfile.js'] },
        sass: {
            files: [
                'scss/**/*.scss'
            ],
            tasks: ['sass']
        }
    },
    clean: ['static/css/styles.css']

  });

  // Load externally defined tasks.
  grunt.loadNpmTasks('grunt-sass');
  grunt.loadNpmTasks('grunt-contrib-watch');
  grunt.loadNpmTasks('grunt-contrib-copy');
  grunt.loadNpmTasks('grunt-contrib-clean');


  // Establish tasks we can run from the terminal.

  grunt.registerTask('css', ['sass']);
  grunt.registerTask('build', ['clean','sass', 'copy']);
  grunt.registerTask('default', ['build']);

}
