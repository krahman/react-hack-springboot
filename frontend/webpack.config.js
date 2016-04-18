module.exports = {
    entry: './index.js',
    output: {path: __dirname, filename: 'build/app.bundle.js'},
    module: {
        loaders: [{
            test: /.jsx?$/,
            loader: 'babel-loader',
            exclude: [/node_modules/, /build/],
            query: {
                presets: ['es2015', 'react']
            }
        }]
    }
}